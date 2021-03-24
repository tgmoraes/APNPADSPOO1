package exercicios.cafeteria;

public class Cafe {
	private final char tipo; // F para forte e T para tradicional
	private final boolean doce;
	
	public Cafe(char tipo, boolean doce) {
		this.doce = doce;
		if(Character.toUpperCase(tipo)=='T' || Character.toUpperCase(tipo)=='F') {
			this.tipo = Character.toUpperCase(tipo);
		} else {
			this.tipo = 'T';
		}
	}
	public String getTipo() {
		if(this.tipo=='T') return "Tradicional";
		else return "Forte";
	}
	public boolean isDoce() {
		return this.doce;
	}
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(!(o instanceof Cafe)) return false;
		Cafe param = (Cafe)o;
		return ((this.doce == param.doce)&&(this.tipo==param.tipo));
	}
}


