import com.pinyougou1.common.pojo.PageResult;
import com.pinyougou1.pojo.Brand;
import com.pinyougou1.pojo.TypeTemplate;
import com.pinyougou1.service.BrandService;
import com.pinyougou1.service.TypeTemplateService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.Serializable;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-service.xml")
public class Demo {
    @Autowired
    private BrandService brandService;
    @Autowired
    private TypeTemplateService typeTemplateService;
    @Test
    public void test011(){
        PageResult byPage = typeTemplateService.findByPage(null, 1, 5);
        System.out.println(byPage);
    }
    @Test
    public void test01(){
        System.out.println(brandService);
        List<Brand> all = brandService.findAll();
        System.out.println(all);
    }
    @Test
    public void test02(){
        Brand brand = new Brand();
        brand.setName("联");
//        List<Brand> byPage = brandService.findByPage(brand, 1, 5);
        PageResult byPage = brandService.findByPage(null,1, 5);
        System.out.println(byPage);
    }
    @Test
    public void test03(){
        Serializable[] ids = {27};
        brandService.deleteAll(ids);
    }
}
