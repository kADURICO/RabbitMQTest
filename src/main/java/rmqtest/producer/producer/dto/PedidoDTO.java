package rmqtest.producer.producer.dto;

public class PedidoDTO {

    private Long id;
    private String cliente;
    private String produto;
    private Float valor;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }

    public String getProduto() { return produto; }
    public void setProduto(String produto) { this.produto = produto; }

    public Float getValor() { return valor; }
    public void setValor(Float valor) { this.valor = valor; }
}