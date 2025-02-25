import java.util.*;

interface Mediaplayer {
	void play();
	void pause();
	void stop();
}

class AudioPlayer implements Mediaplayer
{
	public void play()
	{
		System.out.println("Your Audio is playing");
	}
	public void pause()
	{
		System.out.println("Your Audio is paused");
	}
	public void stop()
	{
		System.out.println("Your Audio is stopped");
	}

}
class VideoPlayer implements Mediaplayer
{
	public void play()
	{
		System.out.println("Your video is playing");
	}
	public void pause()
	{
		System.out.println("Your video is paused");
	}
	public void stop()
	{
		System.out.println("Your video is stopped");
	}

}
class StreamingPlayer implements Mediaplayer
{
	public void play()
	{
		System.out.println("The show is playing");
	}
	public void pause()
	{
		System.out.println("The show is paused");
	}
	public void stop()
	{
		System.out.println("The show is finished");
	}

}



public class Media
{
	public static void choose(int a)
	{
		Scanner sc=new Scanner(System.in);

		while(true)
		{
			System.out.println("1.Play \n2.Pause \n3.Stop");

			if(a==1)
			{
				AudioPlayer A=new AudioPlayer();

				while(true)
				{
					int b=sc.nextInt();

					switch(b)
					{
					case 1:
						A.play();
						break;
					case 2:
						A.pause();
						break;
					case 3:
						A.stop();
						System.exit(0);
					default:
						System.out.println("Enter valid inputs");
						System.exit(0);

					}
				}
			}
			else if(a==2)
			{
				VideoPlayer V=new VideoPlayer();

				while(true)
				{
					int b=sc.nextInt();

					switch(b)
					{
					case 1:
						V.play();
						break;
					case 2:
						V.pause();
						break;
					case 3:
						V.stop();
						System.exit(0);
					default:
						System.out.println("Enter valid inputs");
						System.exit(0);

					}
				}
			}
			else if(a==3)
			{
				StreamingPlayer S=new StreamingPlayer();

				while(true)
				{
					int b=sc.nextInt();

					switch(b)
					{
					case 1:
						S.play();
						break;
					case 2:
						S.pause();
						break;
					case 3:
						S.stop();
						System.exit(0);
					default:
						System.out.println("Enter valid inputs");
						System.exit(0);

					}
				}

			}
		}
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);


		System.out.println("1. Audio player \n 2.Video player \n 3.Streaming platform");
		int n=sc.nextInt();

		switch(n)
		{
		case 1:
			choose(1);
			break;

		case 2:


			choose(2);
			break;

		case 3:

			choose(3);
			break;

		default:
			System.out.println("Invalid Input");



		}

	}



}
