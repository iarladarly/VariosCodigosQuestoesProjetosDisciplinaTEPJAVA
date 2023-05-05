package Model;

public class PapelariaModel {
    private Integer id;
    private String nome;
    private int quant;
    private double valorUnitario;
    private double valorTot;
    private String fabricante;
    private String descricao;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getFabricante(){
        return fabricante;
    }
    public void setFabricante(String fabricante ){
        this.fabricante= fabricante;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao= descricao;
    }

    public int getQuant() {
        return quant;
    }
    public void setQuant(int quant) {
        this.quant = quant;
    }
    public double getValorUnitario() {
        return valorUnitario;
    }
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    public double getValorTot() {
        return valorTot;
    }
    public void setValorTot(double valorTotal) {
        this.valorTot = valorTotal;
    }
    
}
