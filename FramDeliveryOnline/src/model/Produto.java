package model;

public abstract class Produto {
	
	private String codigo;
	private String imagem;
	private String nome;
	private String tipo;
	private String descricao;
	private int qtdEstoque;
	private int qtdVendida;
	private double preco;
	private double desconto;
	private double peso;
	
	public Produto(String codigo, String imagem, String nome, String tipo,
			String descricao, int qtdEstoque, int qtdVendida, double preco,
			double desconto, double peso) {
		super();
		this.codigo = codigo;
		this.imagem = imagem;
		this.nome = nome;
		this.tipo = tipo;
		this.descricao = descricao;
		this.qtdEstoque = qtdEstoque;
		this.qtdVendida = qtdVendida;
		this.preco = preco;
		this.desconto = desconto;
		this.peso = peso;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public int getQtdVendida() {
		return qtdVendida;
	}

	public void setQtdVendida(int qtdVendida) {
		this.qtdVendida = qtdVendida;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
