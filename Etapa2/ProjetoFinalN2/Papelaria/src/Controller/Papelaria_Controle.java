package Controller;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Dao.PapelariaDao;
import Model.PapelariaModel;

public class Papelaria_Controle {
    PapelariaDao produtoDao;

    public Papelaria_Controle() {
        produtoDao = new PapelariaDao();
    }

    public boolean cadastrar(PapelariaModel produto) {
        boolean a = true;
        if (produto.getNome().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Nome", "Erro", 0, new ImageIcon(
                    "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\\btn_sair.png"));
            a = false;
        } else if (produto.getNome().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Nome não pode Ser Nulo", "Erro", 0, new ImageIcon(
                    "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\\btn_sair.png"));
            a = false;
        } else if (produtoDao.existeProduto(produto)) {
            JOptionPane.showMessageDialog(null, "Já existe  Esse produto cadastre outro", "Erro", 0, new ImageIcon(
                    "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\\btn_sair.png"));
            a= false;
        }else if (produto.getDescricao().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Descrição", "Erro", 0, new ImageIcon(
                    "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\\btn_sair.png"));
            a = false;
        }
        else if (produto.getDescricao().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Descrição não pode Ser Nulo", "Erro", 0, new ImageIcon(
                    "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\\btn_sair.png"));
            a = false;
        }
        else if (produto.getFabricante().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Fabricante", "Erro", 0, new ImageIcon(
                    "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\\btn_sair.png"));
            a = false;
        }
        else if (produto.getFabricante().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Fabricante não pode Ser Nulo", "Erro", 0, new ImageIcon(
                    "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\\btn_sair.png"));
            a = false;
        }
        
        
        else if (produto.getQuant() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Quantidade", "Erro", 0, new ImageIcon(
                    "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\btn_sair.png"));
            a = false;
        } else if (produto.getValorUnitario() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Valor Unitario", "Erro", 0, new ImageIcon(
                    "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\\btn_sair.png"));
            a = false;
        } else {
            a = true;
        }
        if (a == true) {
            produtoDao.inserir(produto);
            return a;
        }
        return a;

    }

    public String Produtoseguinte() {
        return produtoDao.ProximoProduto();
    }

    public void pesquisar(String pesquisa, DefaultTableModel modelo) {
        produtoDao.buscarProduto(pesquisa, modelo);
    }

    public PapelariaModel preenche(int id) {
        return produtoDao.preenche(id);
    }

    public boolean editar(PapelariaModel materialModel) {
        boolean a = true;
        if (materialModel.getNome().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Nome", "Erro", 0, new ImageIcon(
                    "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\\btn_sair.png"));
            a = false;
        } else if (materialModel.getNome().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Nome não pode Ser Nulo", "Erro", 0, new ImageIcon(
                    "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\\btn_sair.png"));
            a = false;
        }else if (materialModel.getDescricao().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Descrição", "Erro", 0, new ImageIcon(
                    "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\\btn_sair.png"));
            a = false;
        }
        else if (materialModel.getDescricao().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Descrição não pode Ser Nulo", "Erro", 0, new ImageIcon(
                    "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\\btn_sair.png"));
            a = false;
        }
        else if (materialModel.getFabricante().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Fabricante", "Erro", 0, new ImageIcon(
                    "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\\btn_sair.png"));
            a = false;
        }
        else if (materialModel.getFabricante().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Fabricante não pode Ser Nulo", "Erro", 0, new ImageIcon(
                    "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\\btn_sair.png"));
            a = false;
        }
        
        else if (materialModel.getQuant() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Quantidade", "Erro", 0, new ImageIcon(
                   "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\\btn_sair.png"));
            a = false;
        } else if (materialModel.getValorUnitario() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Valor Unitario", "Erro", 0, new ImageIcon(
                    "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\\btn_sair.png"));
            a = false;
        } else {
            a = true;
        }
        if (a == true) {
            produtoDao.editar(materialModel);
            return a;
        }
        return a;
    }

    public void excluir(PapelariaModel material) {
        produtoDao.excluir(material);
    }
}
