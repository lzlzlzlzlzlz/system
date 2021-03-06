package com.iotek.biz;

import com.iotek.dao.HotelMapper;
import com.iotek.model.Hotel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/4/23.
 */
@Service
public class HotelServiceImpl implements HotelService {
    @Resource
    private HotelMapper hotelMapper;

    public List<Hotel> selectHotel() {
        return hotelMapper.selectHotel();
    }

    public Hotel selectHotpost(Hotel hotel) {
        return hotelMapper.selectHotpost(hotel);
    }

    public boolean addHotel(Hotel hotel) {
        return hotelMapper.addHotel(hotel);
    }

    public boolean delecthotel(Hotel hotel) {
        return hotelMapper.delecthotel(hotel);
    }

    public boolean updatehotel(Hotel hotel) {
        return hotelMapper.updatehotel(hotel);
    }
}
