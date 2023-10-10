package HerançaFuncionario;

public class Engenheiro extends Funcionario {

	private int numCrea;
    public Engenheiro(int numCrea) {

		super();
		this.numCrea = numCrea;
    }
    public int getNumCrea() {
    	return numCrea;
    }
    public void setNumCrea(int numCrea) {
    	this.numCrea = numCrea;
	}
}