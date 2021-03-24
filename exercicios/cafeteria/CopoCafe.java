package exercicios.cafeteria;

public class CopoCafe {
	private final int capacidade;
	private int quantidade;
	private Cafe tipoCafe;
	
	public CopoCafe(int capacidade) {
		this.capacidade = capacidade;
		this.quantidade= 0;
		this.tipoCafe= null;
	}
	public boolean encher(Cafe tipoCafe) {
		if(quantidade==0) {
			this.tipoCafe = tipoCafe;
			this.quantidade = this.capacidade;
			return true;
		} else if (this.tipoCafe.equals(tipoCafe)) {
			this.quantidade = this.capacidade;
			return true;
		} else {
			return false;
		}
	}
	public void esvazia(int qtde) {
		if(qtde>0) {
			if(this.quantidade> qtde) this.quantidade -= qtde;
			else {
				this.quantidade = 0;
				this.tipoCafe = null;
			}
		}
	}
	public int getCapacidade() {
		return this.capacidade;
	}
	public int getQuantidade() {
		return this.quantidade;
	}
	public Cafe getTipoCafe() {
		return this.tipoCafe;
	}
	@Override
	public boolean equals(Object o) {
		if((o == null)||!(o instanceof CopoCafe)) return false;
		CopoCafe param = (CopoCafe)o;
		return (this.tipoCafe.equals(param.tipoCafe)
				&&(this.capacidade==param.capacidade)
				&&(this.quantidade==param.quantidade));
	}
	@Override
	public String toString() {
		String doce;
		if(this.tipoCafe.isDoce()) doce = "adoçado";
		else doce = "sem açúcar";
	
		return String.format("copo de %d mL com %d mL de café %s %s", this.capacidade, 
				this.quantidade, this.tipoCafe.getTipo(), doce);
	}
}


