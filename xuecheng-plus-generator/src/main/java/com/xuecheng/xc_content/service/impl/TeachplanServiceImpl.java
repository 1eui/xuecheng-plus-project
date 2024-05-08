package com.xuecheng.xc_content.service.impl;

import com.xuecheng.xc_content.model.po.TeachplanDTO;
import com.xuecheng.xc_content.mapper.TeachplanMapper;
import com.xuecheng.xc_content.service.TeachplanService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 课程计划 服务实现类
 * </p>
 *
 * @author itcast
 */
@Slf4j
@Service
public class TeachplanServiceImpl extends ServiceImpl<TeachplanMapper, TeachplanDTO> implements TeachplanService {

}
