public class EykleidiaApostash {
	
	float x;
	float y;
	
	public EykleidiaApostash (float x, float y) {
		
		this.x=x;
		this.y=y;	
	}
    public EykleidiaApostash () {
		
		this.x=0;
		this.y=0;	
	}
	
	public void setx(float x) {
		this.x = x;
	}
	
	public float getx() {
		return x;
	}
	public void sety(float y) {
		this.y = y;
	}
	
	public float gety() {
		return y;
	}
	
	 public String toString()
	  {
	    return "x:"+x+",y:"+y;
	  }
	  
	
	public float calculateDistance(EykleidiaApostash shm) {
		
		return (float)Math.sqrt((x-shm.x)*(x-shm.x)+(y-shm.y)*(y-shm.y));
	}

	
	
	

	
}























