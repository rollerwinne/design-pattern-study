package atguigu_shulou;

import atguigu_shulou.dto.RegionDTO;
import atguigu_shulou.dto.RegionList;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;

/**
 * @author shulou
 * @date 2020/7/24 4:30 下午
 */
public class RegionTest {
    public static void main(String[] args) throws IOException {
        // 编译后，项目根路径，写法1
        String url1 = RegionTest.class.getClassLoader().getResource("").getPath();
        // 编译后，项目根路径，写法2
        String url2 = RegionTest.class.getResource("/").getPath();
        // 编译后，文件根路径
        String url3 = RegionTest.class.getResource("").getPath();
        String url4 = new File("").getCanonicalPath().toString();

        System.out.println(url1);
        System.out.println(url2);
        System.out.println(url3);
        System.out.println(url4);

        File file = new File(url2, "region.json");
        System.out.println(file.exists());

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        StringBuilder stringBuilder = new StringBuilder();
        String buffer;
        while ((buffer = bufferedReader.readLine()) != null) {
            stringBuilder.append(buffer);
        }
        String json = stringBuilder.toString();
        Type type = new TypeReference<List<RegionList.Province>>() {
        }.getType();
        List<RegionList.Province> provinces = JSONObject.parseObject(json, type);

//        List<RegionList.Province> provinces = (List<RegionList.Province>)JSONObject.parseObject(json, List.class);
        RegionList regionList = new RegionList();
        regionList.setProvinces(provinces);
        System.out.println(JSONObject.toJSONString(regionList));
//        RegionDTO regionDTO = new RegionDTO(regionList);
//        System.out.println(JSONObject.toJSONString(regionDTO));
    }
}
