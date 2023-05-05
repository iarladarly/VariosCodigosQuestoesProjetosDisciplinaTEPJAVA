package Dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.PapelariaModel;
import Util.Conexao;

public class PapelariaDao {
    
    public PapelariaDao()
    {

    }

    public void inserir(PapelariaModel produtosModel)
    {
        try {
            String INSERT = "INSERT INTO produtos(nomeProd,descricaoPrdo,qtdeProd,valUnitProd,valTotalProd,fabricante) VALUES (?,?,?,?,?,?)";
            PreparedStatement st = Conexao.getConnection().prepareStatement(INSERT);
            st.setString(1, produtosModel.getNome());
            st.setString(2, produtosModel.getDescricao());
            st.setInt(3, produtosModel.getQuant());
            st.setDouble(4, produtosModel.getValorUnitario());
            st.setDouble(5, produtosModel.getValorTot());
            st.setString(6, produtosModel.getFabricante());
            st.execute();
          
            JOptionPane.showMessageDialog(null, "Registro salvo com sucesso", "ok", 1, new ImageIcon(
                    "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\\salvar.png"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro ao cadastrar\n"+e.getMessage(), "Erro", 0, new ImageIcon(
                    "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\\editar.png"));        }
    }

    public String ProximoProduto() {
        String SELECT = "SELECT * FROM produtos order by idProd  desc limit 1";
        try {
            PreparedStatement st = Conexao.getConnection().prepareStatement(SELECT);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return (Integer.parseInt(rs.getString("idProd")) + 1) + "";
            } else {
                return "1";
            }
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "erro ao buscar com o registro", "Erro", 0, new ImageIcon(
                     "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\\excluir.png"));
            return "0";
        }
    }
    
    public boolean existeProduto(PapelariaModel produto) {
        boolean status = false;
        try {
            String SELECT = "SELECT nomeProd FROM produtos where nomeProd = ?";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SELECT);
            st.setString(1, produto.getNome());
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                status = true;
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "erro ao buscar nome  do Produto", "Erro", 0, new ImageIcon(
                     "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\\excluir.png"));
        }
        return status;
    }
    
    public  void buscarProduto(String pesquisa, DefaultTableModel modelo) {
        try {
            String SELECT = "SELECT * from produtos where nomeProd like '%" + pesquisa + "%'";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SELECT);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                modelo.addRow(new Object[] { rs.getInt("idProd"), rs.getString("nomeProd"), rs.getString("descricaoPrdo"),
                        rs.getString("fabricante"), rs.getDouble("valUnitProd"), rs.getInt("qtdeProd"), rs.getDouble("valTotalProd") });
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "erro ao buscar Produto\n" + e.getMessage(), "Erro", 0, new ImageIcon(
                     "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\\salvar.png"));
        }

    }
    


    public PapelariaModel preenche(int id) {
        PapelariaModel produto = new PapelariaModel();
        try {
            String SELECT = "SELECT * FROM produtos where idProd  = ?";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SELECT);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                produto.setId(rs.getInt("idProd"));
                produto.setNome(rs.getString("nomeProd"));
                produto.setDescricao(rs.getString("descricaoPrdo"));
                produto.setFabricante(rs.getString("fabricante"));
                produto.setQuant(rs.getInt("qtdeProd"));
                produto.setValorUnitario(rs.getDouble("valUnitProd"));
                produto.setValorTot(rs.getDouble("valTotalProd"));
            }
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "erro ao buscar produto", "Erro", 0, new ImageIcon(
                     "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\\excluir.png"));
        }
        return produto;
    }

    public void editar(PapelariaModel prod) {
        try {
            String UPDATE = "UPDATE produtos SET nomeProd=?,descricaoPrdo=?,qtdeProd=?,valUnitProd=?,valTotalProd=?,fabricante=? WHERE idProd = ?";
            PreparedStatement st = Conexao.getConnection().prepareStatement(UPDATE);
            st.setString(1, prod.getNome());
            st.setString(2, prod.getDescricao());
            st.setInt(3, prod.getQuant());
            st.setDouble(4, prod.getValorUnitario());
            st.setDouble(5, prod.getValorTot());
            st.setString(6, prod.getFabricante());
            st.setInt(7, prod.getId());
            st.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Editado com sucesso", "Sucesso", 1, new ImageIcon(
                     "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\\salvar.png"));
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "Erro ao Editar no banco de dados" + e.getMessage(), "Erro", 0, new ImageIcon(
                     "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\\salvar.png"));
        }
    }

    public void excluir(PapelariaModel produto) {
        int excluir = JOptionPane.showConfirmDialog(null, "Realmente quer excluir?");
        if (excluir == JOptionPane.YES_OPTION) {
            String EXCLUIR = "DELETE FROM produtos where idProd  = ?";
            try {
                PreparedStatement st = Conexao.getConnection().prepareStatement(EXCLUIR);
                st.setInt(1, produto.getId());
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Excluido com sucesso", "Sucesso", 1, new ImageIcon(
                        "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\\salvar.png"));
            } catch (Exception e) {
               
                JOptionPane.showMessageDialog(null, "Erro ao buscar editar no banco de dados" + e.getMessage(), "Erro", 0,
                        new ImageIcon(
                         "C:\\Users\\IARLA DARLY\\OneDrive\\Documentos\\NetBeansProjects\\Papelaria\\src\\Icones\\salvar.png"));
            }
        }
    }

   
}
