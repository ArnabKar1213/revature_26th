package mypack;

public class Station {
	String number;
	String code;
	String station ;
	double arr,dep;

	Station(String number,String code,String station,double arr,double dep){
		this.number = number;
		this.code = code;
		this.station = station;
		this.arr = arr;
		this.dep = dep;
	}
	public void pDetails(){
		//System.out.println(this.number+"    "+this.code+"    "+this.station+"        "+this.arr+"       "+this.dep );
		System.out.printf("%1s %6s %18s %8.2f %8.2f\n" ,number ,code , station , arr ,dep);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Yasvantpur Delhi Sarai Rohilla C Duronto Express (12213)";
		System.out.println(s);
		System.out.println("------------------------------------------------");
		System.out.println("#    Code      Station           Arr.     Dep.");
		System.out.println("------------------------------------------------");
		
		Station st[] = {
							new Station("1","YPR","Yasvantpur Jn",0.00,23.40),
							new Station("2","GTL","Guntakal Jn",03.45,03.50),
							new Station("3","SC","Secundrabad Jn",08.55,09.10),
							new Station("4","BPQ","Balharshah",13.30,13.35),
							new Station("5","HBJ","Habibganj",21.20,21.25),
							new Station("6","JHS","Jhansi Jn",01.15,01.20),
							new Station("7","DEE","Delhi S Rohilla",07.00,0.00)
				
		};
		for(Station st1:st) {
			st1.pDetails();
		}
		System.out.println("------------------------------------------------");
		
	}

}
