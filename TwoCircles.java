
public class TwoCircles {
	static String[] circles(String[] info) {
		String[] ans = new String[info.length];
		for (int i = 0; i < info.length; i++) {
			String[] dataList = info[i].split(" ");
			int x1 = Integer.parseInt(dataList[0]);
			int y1 = Integer.parseInt(dataList[1]);
			int r1 = Integer.parseInt(dataList[2]);

			int x2 = Integer.parseInt(dataList[3]);
			int y2 = Integer.parseInt(dataList[4]);
			int r2 = Integer.parseInt(dataList[5]);

			int c1,c2;
			if (x1==0) {
				c1=y1;
				c2=y2;			
			}
			else {
				c1=x1;
				c2=x2;
			}

			if (Math.abs(c1-c2) > Math.abs(r1+r2))
				ans[i]= "Disjoint Outside";
			else if(Math.abs(c1-c2) < Math.abs(r1-r2))
				ans[i]= "Disjoint Inside";
			else if(Math.abs(c1-c2) == r1 + r2 || Math.abs(c1-c2) == Math.abs(r1-r2))
				ans[i]= "Touching";
			else if(Math.abs(r1-r2) < Math.abs(c1-c2) && Math.abs(r1+r2) > Math.abs(c1-c2))
				ans[i]= "Intersecting";
			else if(x1 == x2 || y1 == y2)
				ans[i]= "Concentric";
			else
				ans[i]= "May be other type!!!";


		}
		return ans;
	}


}
