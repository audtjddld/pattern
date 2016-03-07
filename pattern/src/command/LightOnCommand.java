package command;

public class LightOnCommand implements Command {

	Light light;
	
	/**
	 * 커멘드를 수행할 객체를 전달 받는다.
	 * @param light
	 */
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	/**
	 * 실행 시킨다.
	 */
	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.off();
	}
	

}
