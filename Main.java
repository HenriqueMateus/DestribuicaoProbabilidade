package destribuicaoPossibilidades;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {0, 1, 2, 3, 4, 5, 6, 7};
		float[] px = {0.21F, 0.367F,0.275F,0.115F,0.029F,0.004F,0.0F, 0.0F};
		System.out.println(media(x, px));
		System.out.println(variancia(x, px, media(x, px)));
		System.out.println(desvioPadrao(variancia(x, px, media(x, px))));
	}
	public static float media(int[] x, float[] px) {
		float media = 0;
		for(int i = 0; i < x.length; i++) {
			float multiplicaXpx = x[i] * px[i];
			media += multiplicaXpx;
		}
		return media;
	}
	public static float variancia(int[] x, float[] px, float media) {
		float variancia = 0;
		for(int i = 0; i < x.length; i++) {
			float multiplicaXpx = (float) (Math.pow((x[i]-media), 2) * px[i]);
			variancia += multiplicaXpx;
		}
		return variancia;

	}
	public static float desvioPadrao(float variancia) {
		float resultado = (float) Math.sqrt(variancia);
		return resultado;
	}
}
