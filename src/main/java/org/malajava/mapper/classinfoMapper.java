package org.malajava.mapper;

import java.util.List;

import org.malajava.entity.classinfo;

public interface classinfoMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table classinfo
	 *
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer classid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table classinfo
	 *
	 * @mbg.generated
	 */
	int insert(classinfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table classinfo
	 *
	 * @mbg.generated
	 */
	int insertSelective(classinfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table classinfo
	 *
	 * @mbg.generated
	 */
	classinfo selectByPrimaryKey(Integer classid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table classinfo
	 *
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(classinfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table classinfo
	 *
	 * @mbg.generated
	 */
	int updateByPrimaryKey(classinfo record);

	List<classinfo> loadAll();
}