package command;

/**
 * 버튼이 하나 밖에 없는 리모콘
 * @author 정명성
 *
 */
public class SimpleRemoteControl {
	Command slot;
	
	public SimpleRemoteControl() {}
	
	/**
	 * 슬롯을 가지고 제어할 명ㄹㅇ을 설정하기 위한 메소드. 이 코드를 사용하는 클라이언트에서 리모컨 버튼의
	 * 기능을 바꾸고 싶다면 이 메소드를 이용해서 얼마든지 바꿀 수 있습니다.
	 * @Author  : 정명성
	 * @Date    : 2016. 3. 7.
	 * @Path    : command.SimpleRemoteControl.java
	 * @param command
	 */
	public void setCommand(Command command) {
		slot = command;
	}
	
	/**
	 * 버튼이 눌려지면 이 메소드가 호출됩니다. 지금 슬롯에 연결된 커맨드 객체의
	 * execute() 메소드만 호출하면 됩니다.
	 * @Author  : 정명성
	 * @Date    : 2016. 3. 7.
	 * @Path    : command.SimpleRemoteControl.java
	 */
	public void buttonWasPressed() {
		slot.execute();
	}
}
