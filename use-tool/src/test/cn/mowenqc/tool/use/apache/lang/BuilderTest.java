package cn.mowenqc.tool.use.apache.lang;

import cn.mowenqc.tool.use.apache.domain.User;
import org.apache.commons.lang3.builder.Builder;
import org.junit.Test;

/****
 * @project: knowledge_parent
 * @author: mowenqc
 * @create-time: 2020/6/2 10:37
 * @description:
 *****/
public class BuilderTest {

    @Test
    public void testBuilder(){
        User user = new MyBuilder().age(1).name("mowenqc").id(3).build();
        System.out.println(user);

    }

    public class MyBuilder extends User implements Builder<User>{

        @Override
        public User build() {
            return this;
        }

        public MyBuilder id(int id){
            setId(id);
            return this;
        }
        public MyBuilder name(String id){
            setName(id);
            return this;
        }
        public MyBuilder age(int id){
            setAge(id);
            return this;
        }
    }

}
