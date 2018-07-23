package com.wangwei.order2.VO;

/**
 * @Auther wangwei
 * @Date 2018/4/8 上午2:03
 */
public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }
}
