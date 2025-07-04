import React, { useState } from "react";
import HeaderComponent from "../components/HeaderComponent";
import TaskListComponent from "../components/TaskListComponent";
import AddTaskComponent from "../components/AddTaskComponent";

export default function TopPage() {
  // activTab変数を管理するusestate
  // 初期値としてtaskを持たせている
  const [activeTab, setActiveTab] = useState('task');
  return(
    <>
      <HeaderComponent/>
      <div className="row">
        {/* onClickイベントで持たせている引数がactiveTabに渡している */}
        <div
          className="tab-pane col-6 border p-3"
          style={{ backgroundColor: activeTab === 'task' ? '#FFD700' : '#DDDDDD' }}
          onClick={() => setActiveTab('task')}
        >
          <h2 className="text-center">一覧</h2>
        </div>
        <div
          className="tab-pane col-6 border p-3"
          style={{ backgroundColor: activeTab === 'add' ? '#FFD700' : '#DDDDDD' }}
          onClick={() => setActiveTab('add')}
        >
          <h2 className="text-center">追加</h2>
        </div>
        <div>
          {activeTab === 'task' && (
            <div id="task">
              <TaskListComponent/>
            </div>
          )}
          {activeTab === 'add' && (
            <div id="add">
              <AddTaskComponent/>
            </div>
          )}
        </div>
      </div>
    </>
  );
}