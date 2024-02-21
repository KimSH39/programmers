from collections import deque

#   0 1 2 3 4 5
# 0   1 0 1 1 1
# 1   1 0 1 0 1
# 2   1 0 1 1 1
# 3   1 1 1 0 1
# 4   0 0 0 0 1

def solution(maps):
    
    # 칸 수를 세어야 하는 문제에서는 False가 아니라 숫자로 초기화하자
    visited = [[-1] * len(maps[0]) for _ in range(len(maps))]
    
    # 출발 지점
    visited[0][0] = 1
    
    n = len(maps)
    m = len(maps[0])
    
    # 이 방향으로 쭉 탐색하겠다?
    # 오케
    dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]
    
    # 큐에 현재 위치 넣기, 큐에는 방문할 위치를 넣음
    queue = deque([(0, 0)])
    
    while queue:
        x, y = queue.popleft()
        
        # 상하좌우 탐색
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            
            # 좌표가 맵을 벗어나지 않고, 탐색한 좌표가 벽이 없는 자리일 때
            if 0 <= nx < n and 0 <= ny < m and maps[nx][ny] == 1:
                # 방문하지 않은 곳이라면
                if visited[nx][ny] == -1:
                    # 방문한 곳의 값을 직전 값에서 1 더한 값으로 바꿈
                    visited[nx][ny] = visited[x][y] + 1
                    queue.append((nx, ny))
    
    return visited[-1][-1]