package br.analisy.alle;

public class DadosGerais {
	private int que[] = new int[3];//uma questao por page							(1q)
	private int vQue[] = new int[3];//varias questoes em uma page					(vqp)
	private int vQPP[] = new int[3];//começa em uma page e termina em outra page	( 1qv)
	private int img[] = new int[3];
	private int tab[] = new int[3];
	
	private StringBuffer naoQ = new StringBuffer();
	private int textoSolto = 0;
	private StringBuffer texto = new StringBuffer();
	
	public StringBuffer getText() {
		return this.texto;
	}
	
	public int[] getQue() {
		return que;
	}
	public void setQue(int[] que) {
		this.que = que;
	}
	public int[] getvQue() {
		return vQue;
	}
	public void setvQue(int[] vQue) {
		this.vQue = vQue;
	}
	public int[] getvQPP() {
		return vQPP;
	}
	public void setvQPP(int[] vQPP) {
		this.vQPP = vQPP;
	}
	public int[] getImg() {
		return img;
	}
	public void setImg(int[] img) {
		this.img = img;
	}
	public int[] getTab() {
		return tab;
	}
	public void setTab(int[] tab) {
		this.tab = tab;
	}
	
	public void sinc(DadosPagina dp) throws Exception {
		this.naoQ.append(dp.getNaoQ());
		this.textoSolto += dp.getTextoSolto();
		this.texto.append(dp.getText());
		
		if(dp.temProblen()) {
			if(dp.getSumProblen() == 1) 
				dp.getLayout().add(this.que, dp.getSumProblen()); 
			else 
				if(dp.getLayout().equals(LayoutPdf.COLUNA_2) && dp.getSumProblen()<3)
					dp.getLayout().add(this.que, dp.getSumProblen());
				else
					dp.getLayout().add(this.vQue, dp.getSumProblen());
		
			dp.getLayout().add(this.img, dp.getSumImg());
			dp.getLayout().add(this.tab, dp.getSumTable());
		}else {//nao tem problmema é uma VQPP
			//remove uma questao
			if(!dp.pass) {
				dp.pass = true;
				
				if(dp.getAnterior() == null)
					throw new Exception("pagina sem questoes:texto sem questoes, verifique o arquivo");
				
				if(dp.getAnterior().getSumProblen() == 1) 
					dp.getAnterior().getLayout().less(this.que, 1); 
				else 
					dp.getAnterior().getLayout().less(this.vQue, 1);
				dp.getAnterior().getLayout().add(this.vQPP, 1);
			}
		}
	}
	
//	public void print() {
//		System.out.printf("\n       c1    c2    mc\n");
//		System.out.printf("1Q  %5d %5d %5d\n",		que[1],que[2],que[0]);
//		System.out.printf("1QV %5d %5d %5d\n",		vQPP[1],vQPP[2],vQPP[0]);
//		System.out.printf("VQP %5d %5d %5d\n",		vQue[1],vQue[2],vQue[0]);
//		System.out.printf("img %5d %5d %5d\n",		img[1],img[2],img[0]);
//		System.out.printf("tab %5d %5d %5d\n",	tab[1],tab[2],tab[0]);
//		System.out.println("Total questoes: "+(que[1]+que[2]+que[0]+vQue[1]+vQue[2]+vQue[0]+vQPP[1]+vQPP[2]+vQPP[0]));
//		System.out.println("total texto solto: "+this.textoSolto);
//		System.out.println(this.naoQ.toString());
//		System.out.printf("------------------------------------\n\n");
//	}
	
	public String printToString() {
		StringBuffer s = new StringBuffer();
		s.append(String.format("\n       c1    c2    mc\n"));
		s.append(String.format("1Q  %5d %5d %5d\n",		que[1],que[2],que[0]));
		s.append(String.format("1QV %5d %5d %5d\n",		vQPP[1],vQPP[2],vQPP[0]));
		s.append(String.format("VQP %5d %5d %5d\n",		vQue[1],vQue[2],vQue[0]));
		s.append(String.format("img %5d %5d %5d\n",		img[1],img[2],img[0]));
		s.append(String.format("tab %5d %5d %5d\n",	tab[1],tab[2],tab[0]));
		s.append("Total questoes: "+(que[1]+que[2]+que[0]+vQue[1]+vQue[2]+vQue[0]+vQPP[1]+vQPP[2]+vQPP[0]));
		s.append("\ntotal texto solto: "+this.textoSolto+"\n");
		s.append(this.naoQ.toString());
		s.append("\n------------------------------------\n\n");
		
		return s.toString();
	}
		
}
