# alinesno-infra-base-sensitive
敏感词过滤服务是一个用于过滤系统中的敏感词，以保护用户和系统的安全的服务。 

## 对外接口

整理后的接口信息如下所示：

| 序号 | 接口URL                      | 描述                         | 请求参数                      | 备注         |
|------|------------------------------|------------------------------|------------------------------|--------------|
| 1    | /api/sensitiveFilter/add     | 添加敏感词                   | word (敏感词内容)            |              |
| 2    | /api/sensitiveFilter/delete  | 删除敏感词                   | word (敏感词内容)            |              |
| 3    | /api/sensitiveFilter/modify  | 修改敏感词                   | oldWord, newWord             |              |
| 4    | /api/sensitiveFilter/import  | 导入敏感词                   | filePath (导入文件路径)     |              |
| 5    | /api/sensitiveFilter/export  | 导出敏感词                   | filePath (导出文件路径)     |              |
| 6    | /api/sensitiveFilter/filter  | 过滤文本中的敏感词           | text (待过滤文本)            |              |
| 7    | /api/sensitiveFilter/filter-batch | 批量过滤文本中的敏感词   | textList (待过滤文本列表)   |              |
| 8    | /api/sensitiveFilter/detect  | 检测文本中的敏感词           | text (待检测文本)            |              |
| 9    | /api/sensitiveFilter/detect-batch | 批量检测文本中的敏感词 | textList (待检测文本列表)   |              |
| 10   | /api/sensitiveFilter/set-strategy | 设置敏感词替换策略       | strategy (替换策略)        |              |
| 11   | /api/sensitiveFilter/get-strategy | 获取敏感词替换策略       |                              |              |
| 12   | /api/sensitiveFilter/get-log | 获取敏感词日志               |                              |              |
| 13   | /api/sensitiveFilter/optimize | 优化敏感词过滤性能         |                              |              |

这些接口URL采用了驼峰形式，并根据功能进行了分类和整理。您可以根据需要进一步调整和扩展这些接口。

## 鸣谢

- 集成敏感词过滤框架[sensitive-word](https://github.com/houbb/sensitive-word)
