
public class Aluno {
	
	private String nome;
	private String matricula;
	private String curso;
	private String email;
	private String disciplinas[];
	
	public Aluno() {
		
		nome = "N/A";
		matricula = "N/A";
		curso = "N/A";
		email = "N/A";
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String input) {
		this.nome = input;
	}
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String input) {
		this.matricula = input;
	}
	
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String input) {
		this.curso = input;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String input) {
		this.email = input;
	}
	
	
	public String[] getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(String[] input) {
		this.disciplinas = input;
	}
	
	public static void main(String[] args) {
		
		Aluno isaac = new Aluno();
		
		isaac.setMatricula("Isaac Marlon da Silva Lourenço");
		isaac.setCurso("Informática");
		System.out.println(isaac.getEmail());
		isaac.setMatricula("20171114010047");
		String[] dis = {"pt","eng","math"};
		isaac.setDisciplinas(dis);
		
		for (String disciplina : isaac.getDisciplinas()) {
			
			System.out.println(disciplina);
			
		}

	}
}
