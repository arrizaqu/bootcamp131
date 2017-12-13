package logic_2;

import java.util.Arrays;

import utilize.DeretAngka;

public class Soal_2b {

	String[][] data;
	int kolom;
	int baris;
	
	public void setDataArray(int n){
		this.baris = n;
		this.kolom = n;
		this.data = new String[this.baris][this.kolom];
		int[] deret = DeretAngka.getDeret_2(0, n);
		System.out.println(Arrays.toString(deret));
		
		for(int i = 0; i < this.baris; i++){
			for(int j = 0; j < this.kolom; j++){
				if(i + j == n - 1){
					data[i][j] = deret[n - 1 - j]+"";
				}
			}
		}
	}
	
	public void showData(){
		for(int i = 0; i < this.baris; i++){
			for(int j = 0; j < this.kolom; j++){
				System.out.print(data[i][j] + "\t");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args){
		Soal_2b jawab = new Soal_2b();
		jawab.setDataArray(9);
		jawab.showData();
	}
}
