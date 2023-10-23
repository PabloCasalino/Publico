import React, { useState } from 'react'

export default function Counter() {

    const [counter1, setCounter] = useState(0);

    function add() {
        setCounter(counter1 + 1)
    }

    function substraction() {
        setCounter(counter1 - 1)
    }

    function restart(){
        setCounter (0)
    }

  return (
    <div>
      <p>{counter1}</p>
      <button onClick={add}> Sumar</button>
      <button onClick={substraction}> restar</button>
      <button onClick={restart}> inicializar</button>

    </div>
  )
}
