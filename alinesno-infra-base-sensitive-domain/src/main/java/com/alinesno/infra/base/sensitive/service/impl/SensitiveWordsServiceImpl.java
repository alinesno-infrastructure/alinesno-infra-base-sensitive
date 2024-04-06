package com.alinesno.infra.base.sensitive.service.impl;

import com.alinesno.infra.base.sensitive.entity.SensitiveConfigEntity;
import com.alinesno.infra.base.sensitive.mapper.SensitiveConfigMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alinesno.infra.base.sensitive.entity.SensitiveWordsEntity;
import com.alinesno.infra.base.sensitive.mapper.SensitiveWordsMapper;
import com.alinesno.infra.base.sensitive.service.ISensitiveWordsService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author LuoXiaoDong
 * @version 1.0.0
 */
@Slf4j
@Service
public class SensitiveWordsServiceImpl extends IBaseServiceImpl<SensitiveWordsEntity, SensitiveWordsMapper> implements ISensitiveWordsService {

	@Autowired
	private SensitiveConfigMapper sensitiveWordMapper;

	/**
	 * 添加敏感词
	 *
	 * @param word 敏感词内容
	 * @return 添加是否成功的布尔值，成功返回true，失败返回false
	 */
	@Override
	public boolean addSensitiveWord(String word) {
		SensitiveConfigEntity sensitiveWord = new SensitiveConfigEntity();
		sensitiveWord.setWord(word);

		sensitiveWordMapper.insert(sensitiveWord) ;

		refreshSensitiveWord() ;

		return true ;
	}

	/**
	 * 删除敏感词
	 *
	 * @param word 敏感词内容
	 * @return 删除是否成功的布尔值，成功返回true，失败返回false
	 */
	@Override
	public boolean deleteSensitiveWord(String word) {
		QueryWrapper<SensitiveConfigEntity> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("word", word);
		sensitiveWordMapper.delete(queryWrapper);

		refreshSensitiveWord() ;

		return true ;
	}

	/**
	 * 获取全部敏感词
	 *
	 * @return 全部敏感词的列表
	 */
	@Override
	public List<SensitiveConfigEntity> getAllSensitiveWords() {
		return sensitiveWordMapper.selectList(null);
	}

	@Override
	public void refreshSensitiveWord() {

	}

}
