package shop.service.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import shop.dao.AreaDao;
import shop.entity.Area;
import shop.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;


    @Override
    public List<Area> getAreaList() throws JsonParseException, JsonMappingException, IOException {
        List<Area> areaList = null;
        areaList = areaDao.queryArea();
        return areaList;
    }

  
}
