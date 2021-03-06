package shop.service;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import shop.entity.Area;

public interface AreaService {
    /**
     * 
     * @return
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
    List<Area> getAreaList() throws JsonParseException, JsonMappingException,
            IOException;
}
