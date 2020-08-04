package atguigu_shulou.dto;

import lombok.Data;

import java.util.List;

/**
 * @author shulou
 * @date 2020/7/24 4:42 下午
 */
@Data
public class RegionList {
    List<Province> provinces;

    @Data
    public static class Province {
        String name;
        List<City> cities;

        @Data
        public static class City {
            String name;
            List<String> area;
        }
    }
}
