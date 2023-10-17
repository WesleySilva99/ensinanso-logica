package logicaDeProgramacao;

public class PrimeiraClasse {

	
	/*
	 * Na	 empresa	 em	 que	trabalhamos,	 há	tabelas	 com	 o	 gasto	 de	 cada	 mês.	 Para	 fechar	 o	 balanço	 do
		primeiro	trimestre,	 precisamos	 somar	 o	 gasto	total.	Sabendo	 que,	em	janeiro,	 foram	 gastos	 15	mil
		reais,	em	fevereiro,	23	mil	reais	e,	em	março,	17	mil	reais,	faça	um	programa	que	calcule	e	imprima
		a	despesa	total	no	trimestre	e	a	média	mensal	de	gastos.
	 */
	/*
	public static void main(String[] args) {
		
		int janeiro = 15000;
		
		int fevereiro = 23000;
		
		int marco = 17000;
		
		int totalGasto = janeiro + fevereiro + marco;
		
		int media = totalGasto / 3;
		
		System.out.println("total gasto: " + totalGasto);
		
		System.out.println("media do trimestre: " + media);
		
	}*/
	
	/*
	 * Na escola eu tirei as seguintes notas, 8, 6, 4, e 3. qua é a minha média do ano?
	 * sabendo que a média da escola eh 8, eu fui aprovado?
	 * 
	 */
	
	public static void main(String[] args) {
		
		int nota1 = 8;
		
		int nota2 = 8;
		
		int nota3 = 8;
		
		int nota4 = 7;
		
		int totalDeNotas = nota1 + nota2 + nota3 + nota4;
		
		int media = totalDeNotas / 4;
		
		System.out.println("media anual: " + media);
		
		if(media >= 8) {
			System.out.println("aprovado");
		}else {
			System.out.println("reprovado");
		}
		
	}
	
}
