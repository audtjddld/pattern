package command;

public interface Command {
	/**
	 * 커멘트 패턴 예제
	 * @Author  : 정명성
	 * @Date    : 2016. 3. 7.
	 * @Path    : command.Command.java
	 */
	public void execute();
	
	/**
	 * 커맨드 패턴 예제
	 * @Author  : 정명성
	 * @Date    : 2016. 3. 7.
	 * @Path    : command.Command.java
	 */
	public void undo();
}
