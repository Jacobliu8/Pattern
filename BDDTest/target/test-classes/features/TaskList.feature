#language: zh-CN
功能:任务管理

  场景大纲: 完成任务
    假设 我的任务清单里<total>个任务
    当 我完成<finished>件任务之后
    那么 我还剩下<left>件完未成的任务
    例子:
      | total | finished | left |
      | 3     | 1        | 2    |
      | 5     | 1        | 4    |

  场景大纲:得到任务
    假设 我的任务清单里<total>个任务
    当 我获得<new>件任务之后
    那么 我还剩下<left>件完未成的任务
    例子:
      | total | new | left |
      | 3     | 1   | 4    |
      | 5     | 1   | 6    |