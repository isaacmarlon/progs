
public class TesteLivro {

	public static void main(String[] args) {
		
		Livro aLei = new Livro();
		
		aLei.setAberto(true);
		System.out.println(aLei.getAberto());
		aLei.setTitulo("A lei");
		
		System.out.println(aLei);
	}

}
