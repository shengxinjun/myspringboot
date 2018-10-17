package com.dao;
import org.jooq.Condition;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.domain.File;
import sxj.db.tables.records.FileRecord;

import static sxj.db.Tables.FILE;

import java.util.ArrayList;
import java.util.List;
@Repository
public class FileDao extends DAOImpl<FileRecord,File, Integer> {

	@Autowired
	private DSLContext dslContext;
	
    @Autowired
    public FileDao(Configuration configuration) {
        super(FILE, File.class, configuration);
    }
    @Override
    protected Integer getId(File file) {
        return file.getId();
    }
    /****************************************************
	 * 下面是自定义方法
	 ***************************************************************/
    
    /**
     * 根据所属哪个表和父id删除file
     * @param source 1.order，2.product
     * @param sourceId 父id
     */
    public void deleteFileBySourceAndSourceId(Integer source,Integer sourceId) {
    	List<Condition> conditions = new ArrayList<>();
    	conditions.add(FILE.SOURCE.eq(source));
    	conditions.add(FILE.SOURCE_ID.eq(sourceId));
    	dslContext.deleteFrom(FILE).where(conditions);
    	
    }
    /**
     * 根据所属哪个表和父id查询file
     * @param source
     * @param sourceId
     * @return
     */
    public List<File> findFileBySourceAndSourceId(Integer source,Integer sourceId){
    	List<Condition> conditions = new ArrayList<>();
    	conditions.add(FILE.SOURCE.eq(source));
    	conditions.add(FILE.SOURCE_ID.eq(sourceId));
    	return dslContext.select().from(FILE).where(conditions).fetchInto(File.class);
    }
    /**
     * 根据所属哪个表和父id查询fileId
     * @param source
     * @param sourceId
     * @return
     */
    public List<Integer> findFileIdBySourceAndSourceId(Integer source,Integer sourceId){
    	List<Condition> conditions = new ArrayList<>();
    	conditions.add(FILE.SOURCE.eq(source));
    	conditions.add(FILE.SOURCE_ID.eq(sourceId));
    	return dslContext.select(FILE.ID).from(FILE).where(conditions).fetchInto(Integer.class);
    }
    
}
