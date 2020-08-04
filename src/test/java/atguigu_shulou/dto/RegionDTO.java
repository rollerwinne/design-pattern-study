package atguigu_shulou.dto;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shulou
 * @date 2020/7/24 4:56 下午
 */
@Data
public class RegionDTO {
    Map<String, Map<String, List<String>>> region;

    public RegionDTO(RegionList regionList) {
        region = new HashMap<>();
        List<RegionList.Province> provinces = regionList.getProvinces();
        //provinces=(List<RegionList.Province>)JSONObject.parseObject(JSONObject.toJSONString(provinces),List.class);
        provinces.forEach(province -> {
            //province= JSONObject.parseObject(JSONObject.toJSONString(province),RegionList.Province.class);
            Map<String, List<String>> cities = new HashMap<>();
            province.getCities().forEach(city -> {
                //city= JSONObject.parseObject(JSONObject.toJSONString(city),RegionList.Province.City.class);
                String cityName = city.getName();
                cities.put(cityName, city.getArea());
            });
            region.put(province.getName(), cities);
        });
    }
}
