package HerançaFuncionario;

public class Administrador extends Funcionario {
	private int cra;

	public Administrador(int cra) {
		super();
		this.cra = cra;
	}
    public int getCra() {
		return cra;
	}
    public void setCra(int cra) {
		this.cra = cra;
    }
}
