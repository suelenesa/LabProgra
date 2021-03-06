package lab07;
/**
 * @Aluna Suelene Sa
 */

import java.util.ArrayList;
import java.util.List;

public class Taxista extends Rodoviario {
	public static List<Taxista> taxista = new ArrayList<Taxista>();
	private static final double TAXA = 0.5;
	private int numeroDePassageirosPorAno;

	public Taxista(String nome, String numero, boolean temCasaPropria, boolean temCarro, double valorDosBens,
			double quilometro, int numeroDePassageiros) throws Exception {
		super(nome, numero, temCasaPropria, temCarro, valorDosBens, quilometro);
		setNumeroDePassageirosPorAno(numeroDePassageirosPorAno);
	}

	/**
	 * @throws Exception: Sera lancada caso o numero de passageiros passado seja invalido.
	 */
	private void setNumeroDePassageirosPorAno(int numeroDePassageirosPorAno) throws Exception {
		if (numeroDePassageirosPorAno >= 0) {
			this.numeroDePassageirosPorAno = numeroDePassageirosPorAno;
		} else {
			throw new Exception("O numero de passageiros transportados nao pode ser negativo.");
		}
	}

	/**
	 * @return O numero de passageiros tranportados.
	 */
	public int getNumeroDePassageirosPorAno() {
		return numeroDePassageirosPorAno;
	}

	/**
	 * Calcula o imposto que devera ser pago pelo taxista.
	 */
	@Override
	protected double getTributacao() {
		return TAXA * this.numeroDePassageirosPorAno;
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(super.toString());
		string.append("\nNumero total de passageiros transportados: " + numeroDePassageirosPorAno + "\n");
		return string.toString();
	}
}
