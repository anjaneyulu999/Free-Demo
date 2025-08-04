package javaProject;

public class operators {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		int z=30;

		if((x>y++)&(++y<z)){
			x++;
		}
			else {
		y++;		
		}
		System.out.println(x+"......"+y);
	}

}
