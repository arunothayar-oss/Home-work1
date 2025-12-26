class TrafficLight
{
	public static void main(String[] args)
	{
		String signals="Red";
		switch(signals)
		{
			case "Red":
			System.out.println("Stop");
			break;
			case "Yellow":
			System.out.println("Wait");
			break;
			case "Green":
			System.out.println("go");
			break;
		}
	}
}