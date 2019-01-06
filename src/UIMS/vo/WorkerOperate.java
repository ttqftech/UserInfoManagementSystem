package UIMS.vo;

public interface WorkerOperate {
	public int add(Person person);					// 添加
	public int delete(Person person);				// 删除
	public int update(Worker from, Worker to);		// 修改
	public Person findName(String toSearch);		// 精确查找
	public Person fuzzySearch(String toSearch);		// 模糊查找
	public int count();
}