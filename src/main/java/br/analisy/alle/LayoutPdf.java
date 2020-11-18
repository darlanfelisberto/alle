package br.analisy.alle;

public enum LayoutPdf {
	MISTO(0),COLUNA_1(1),COLUNA_2(2);

	private int index;
	
	public int getIndex() {
		return this.index;
	}
	
	private LayoutPdf(int index) {
		this.index = index;
	}
	
	public void add(int []vec,int sum) {
		vec[this.index] += sum;
	}
	
	
	public void less(int []vec,int sum) {
		vec[this.index] -= sum;
	}
	
}
