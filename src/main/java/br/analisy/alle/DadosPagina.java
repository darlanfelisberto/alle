package br.analisy.alle;

public class DadosPagina {

	public boolean pass = false;
	private int sumProblen;
	private int sumImg;
	private int sumTable;
	private LayoutPdf layout;
	private StringBuilder text = new StringBuilder();
	
	private StringBuffer naoQ = new StringBuffer();
	private int textoSolto = 0;

	private DadosPagina anterior;
	
	
	public String getNaoQ() {
		return naoQ.toString();
	}

	public void addTextoSolto(String c) {
		this.naoQ.append(c);
		this.textoSolto++;
	}

	public int getTextoSolto() {
		return textoSolto;
	}

	public DadosPagina(DadosPagina anterior) {
		super();
		this.anterior = anterior;
	}

	public boolean temProblen() {
		return this.sumProblen > 0;
	}

	public void addQuestao() {
		this.sumProblen++;
	}

	public void addImg() {
		this.sumImg++;
	}

	public void addTab() {
		this.sumTable++;
	}

	public DadosPagina getAnterior() {
		return anterior;
	}

	public void setAnterior(DadosPagina anterior) {
		this.anterior = anterior;
	}

	public int getSumProblen() {
		return sumProblen;
	}

	public void setSumProblen(int sumProblen) {
		this.sumProblen = sumProblen;
	}

	public int getSumImg() {
		return sumImg;
	}

	public void setSumImg(int sumImg) {
		this.sumImg = sumImg;
	}

	public int getSumTable() {
		return sumTable;
	}

	public void setSumTable(int sumTable) {
		this.sumTable = sumTable;
	}

	public LayoutPdf getLayout() {
		return layout;
	}

	public void setLayout(LayoutPdf layout) {
		this.layout = layout;
	}

	public StringBuilder getText() {
		return text;
	}

	public void setText(StringBuilder text) {
		this.text = text;
	}

}
