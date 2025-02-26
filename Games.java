 interface pubg
{
	abstract void rating();


	default void features()
	{
		System.out.println("In PUBG many events will be conducted as season changes");
	}

	static void play()
	{
		System.out.println("PUBG controls are very sensitive to play");

	}
}

interface freefire extends pubg
{
	abstract void rating();


	default void features()
	{
		System.out.println("In freefire we can have may gun skins and character powers that is less available in PUBG");
	}

	static  void play()
	{
		System.out.println("Free fire is less sensitive than PUBG");
	}

}



public class Games implements pubg,freefire
{
	public void rating()
	{
		System.out.println("Rating is common for both FreeFire and PUBG : 4.5 ");
	}



	public static void main(String[] args) {

		Games obj=new Games();
		obj.features();

		pubg.play();
		freefire.play();

		obj.rating();



	}
}