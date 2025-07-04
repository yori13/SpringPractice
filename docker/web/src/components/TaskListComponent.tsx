import React from "react";

export default function TaskListComponent() {
  const list = [
    { id: 1, task: "開発環境構築", limit: "2025-07-05", status: "対応中" },
    { id: 2, task: "テーブル設計", limit: "", status: "未対応" },
    { id: 3, task: "外部設計（バックエンド）", limit: "2025-07-06", status: "未対応" },
    { id: 4, task: "要件定義", limit: "2025-07-01", status: "完了" }
  ];

  const today = new Date();
  today.setHours(0, 0, 0, 0);

  return (
    <>
      <style>{`
        .deadline {
          background-color: pink !important;
          color: red !important;
        }
        .warning {
          background-color: yellow !important;
          color: black !important;
        }
        .complate {
          background-color: gray !important;
          color: black !important;
        }
      `}</style>
      <div>
        <table className="table table-bordered">
          <thead>
            <tr>
              <th className="text-center">期限</th>
              <th className="text-center">タスク名</th>
              <th className="text-center">ステータス</th>
              <th className="text-center">編集/削除</th>
            </tr>
          </thead>
          <tbody>
            {list.map((item) => {
              const limitDate = new Date(item.limit.replace(/\//g, "-"));
              const diffTime = limitDate.getTime() - today.getTime();
              const diffDays = Math.floor(diffTime / (1000 * 60 * 60 * 24));

              return (
                <tr key={item.id}>
                  <td
                    className={
                      item.status==="完了"
                      ?"complate"
                      :diffDays < 0
                        ? "deadline"
                        : diffDays <= 3
                        ? "warning"
                        : ""
                    }
                  >
                    {item.limit}
                  </td>
                  <td
                    className={
                      item.status==="完了"
                      ?"complate"
                      :diffDays < 0
                        ? "deadline"
                        : diffDays <= 3
                        ? "warning"
                        : ""
                    }
                  >
                    {item.task}
                  </td>
                  <td
                    className={
                      item.status==="完了"
                      ?"complate"
                      :diffDays < 0
                        ? "deadline"
                        : diffDays <= 3
                        ? "warning"
                        : ""
                    }
                  >
                    {item.status}
                  </td>
                  <td
                    className={
                      item.status==="完了"
                      ?"complate"
                      :diffDays < 0
                        ? "deadline"
                        : diffDays <= 3
                        ? "warning"
                        : ""
                    }
                  >
                    <input type="button" value="編集" className="btn btn-success me-2" />
                    <input type="button" value="削除" className="btn btn-danger"/>
                  </td>
                </tr>
              );
            })}
          </tbody>
        </table>
      </div>
    </>
  );
}
