package brook.example.command;


//��������ӿ�
public interface Command {

	//ִ�ж���(����)
	public void execute();
	//��������(����)
	public void undo();
}
