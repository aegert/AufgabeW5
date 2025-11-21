package h2;

public class H2_main {
	
	public static void main(String[] args) {
	int n =0;
	int digits =0;
	int m =10;
	int[] a = {0,0,0,0,0,0,0,0,0};
	int[] b = {0,0,0,0,0,0,0,0,0};
	digits =0;
	if(n==0) {
		digits=1;
	}
	else {
	for(int i =a.length-1;i>0;i--) {
		b[i]=(n%m);
		if(i<8) {
		a[i]=((n%m)-b[i+1])/(m/10);
		}
		else
		{a[i]=n%m;}
		digits++;
		if(n<m) {
		break;
		}
		m =m*10;
		
		
	}
	}
	}
}
