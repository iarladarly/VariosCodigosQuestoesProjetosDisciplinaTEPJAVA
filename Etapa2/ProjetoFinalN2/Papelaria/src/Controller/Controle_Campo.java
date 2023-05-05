package Controller;
import javax.swing.text.*;
public class Controle_Campo extends PlainDocument {

    private static final long serialVersionUID = 1L;
    public static final int decimal = 9;
    private int iMaxLength;
    private Campo tipo;
    
    public enum Campo {      
        padronizado, numeroespaco, letras, letrasespacos,decimais,numero, letrasnumeros, letrasnumerosespacos;
    }

    public Controle_Campo(int maxlen, Campo tipo) {
        super();
        iMaxLength = maxlen;
        this.tipo = tipo;
    }

    public Controle_Campo(int maxlen) {
        super();
        iMaxLength = maxlen;
        tipo = Campo.padronizado;
    }
    
    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null)
            return;

        if (!isAceito(str))
            return;

        if (iMaxLength <= 0) 
        {
            super.insertString(offset, str, attr);
            return;
        }
        int ilen = (getLength() + str.length());
        if (ilen <= iMaxLength)super.insertString(offset, str, attr); 
        else { if (getLength() == iMaxLength)
                return;String newStr = str.substring(0, (iMaxLength - getLength()));
                super.insertString(offset, newStr, attr);
        }
    }
    
    private boolean isAceito(String str) {
        if (tipo == Campo.padronizado) return true;
        for (int i = 0; i < str.length(); i++) {
            if (tipo == Campo.letras && !Character.isLetter(str.charAt(i)))
                return false;
            else if (tipo == Campo.letrasespacos && !Character.isSpaceChar(str.charAt(i))
                    && !Character.isLetter(str.charAt(i)))
                return false;
            else if (tipo == Campo.letrasnumeros && !Character.isDigit(str.charAt(i))
                    && !Character.isLetter(str.charAt(i)))
                return false;
            else if (tipo == Campo.letrasnumerosespacos && !Character.isSpaceChar(str.charAt(i))
                    && !Character.isLetter(str.charAt(i)) && !Character.isDigit(str.charAt(i)))
                return false;
            else if (tipo == Campo.numero && !Character.isDigit(str.charAt(i)))
                return false;
            else if (tipo == Campo.numeroespaco && !Character.isDigit(str.charAt(i))
                    && !Character.isSpaceChar(str.charAt(i)))
                return false;
            else if (tipo == Campo.decimais && Character.isLetter(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
