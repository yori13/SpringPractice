import React from "react";

export default function HeaderComponent() {
  const handleLogout = () => {
    alert('チョコミントよりもあ・な・た❤️');
  }
  return(
    <>
      <nav className="navbar d-flex justify-content-between align-items-center px-3" style={{ backgroundColor: '#5624d0' }}>
        <h1 className="text-white m-0">めもアプリ</h1>
        <p className="text-white m-0" style={{ cursor: 'pointer' }} onClick={handleLogout} >
          ログアウト
        </p>
      </nav>
    </>
  );
}