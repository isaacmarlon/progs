
public class Livro {
	
	private String titulo;
	private String autor;
	private String editora;
	private int ano;
	private double valor;
	
	private boolean aberto;
	private boolean usado;
	
	
	
	
	
	public Livro() {
		
		titulo = "N/A";
		autor = "N/A";
		editora = "N/A";
		ano = 0;
		valor = 0.00;
		aberto = false;
		usado = false;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Livro manifesto = new Livro();
		
		manifesto.setTitulo("Manifesto Comunista");
		manifesto.setAutor("Karl Marx");
		manifesto.setAno(1848);
		manifesto.setValor(17.81);
		manifesto.setAberto(true);
		manifesto.setUsado(false);
		
		manifesto.descricao();
		
	}
	
	
	public String toString() {
		return "Livro: " + getTitulo();
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String input) {
		this.titulo = input;
	}
	
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String input) {
		this.autor = input;
	}
	
	
	public String getEditora() {
		return editora;
	}
	public void setEditora(String input) {
		this.editora = input;
	}
	
	
	public int getAno() {
		return ano;
	}
	public void setAno(int input) {
		this.ano = input;
	}
	
	
	public double getValor() {
		return valor;
	}
	public void setValor(double input) {
		this.valor = input;
	}
	
	
	public boolean getAberto() {
		return aberto;
	}
	public void setAberto(boolean input) {
		this.aberto = input;
	}
	
	
	public boolean getUsado() {
		return usado;
	}
	public void setUsado(boolean input) {
		this.usado = input;
	}
	
	
	
	
	
	public void descricao() {
		
		System.out.println(this.getTitulo());
		System.out.println(this.getAutor());
		System.out.println(this.getEditora());
		System.out.println(this.getAno());
		System.out.println(this.getValor());
		System.out.println(this.getAberto());
		System.out.println(this.getUsado());
		
	}

	
	
	
	
}
