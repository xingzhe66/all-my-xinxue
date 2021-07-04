package test1;

/**
 * @Author SUNLLM
 * @Description 境由心生, 事在人为
 * @Date 2021/7/3
 * @return
 **/
public class Book implements Cloneable{

    private String name;


    public Book(String name){
        this.name = name;
    }

    @Override
    protected Book clone()  {
        try {
            return (Book)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
