import React from 'react';
import { useNavigate } from 'react-router-dom';
import DemoComponent from '../components/demoComponent';

export default function DemoPage(){
  const navigate = useNavigate();
  const handleClick = () => {
    navigate('/top');
  }
  return(
    <>
      <h1>demoPage!!</h1>
      <DemoComponent/>
      <button onClick={handleClick}>押してくれ</button>
    </>
  );
}