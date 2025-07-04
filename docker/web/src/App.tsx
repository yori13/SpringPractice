import { Routes, Route } from 'react-router-dom';
import './App.css';
import DemoPage from './pages/demo';
import TopPage from './pages/TopPage';

function App() {
  return (
    <>
      <Routes>
        <Route path='/' element={<DemoPage/>}/>
        <Route path='/top' element={<TopPage/>}/>
      </Routes>
    </>
  );
}

export default App;
