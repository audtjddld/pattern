package command;

/**
 * 클라이언트에 해당되는 부분
 * @author 정명성
 *
 */
public class RemoteControlTest {
	public static void main(String[] args) {
		/**
		 * remote 변수가 인보커(invoker)역할을 합니다.
		 * 필요한 작업을 요청할 때 사용할 커맨드 객체를 인자로 전달받을 겁니다.
		 */
		SimpleRemoteControl remote = new SimpleRemoteControl();
		/**
		 * 요청을 받아서 처리할 리시버(Receiver)인 Light객체를 생성합니다.
		 */
		Light light = new Light();
		/**
		 * 커맨드 객체를 생성합니다. 이때 리시버를 전달해 줍니다.
		 */
		LightOnCommand lightOn = new LightOnCommand(light);
		/**
		 * 커멘드 객체를 인보커한테 전달해 줍니다.
		 */
		remote.setCommand(lightOn);
		/**
		 * 이제 버튼을 눌러보겠습니다.
		 * (커맨드 실행)
		 */
		remote.buttonWasPressed();
	}
}
